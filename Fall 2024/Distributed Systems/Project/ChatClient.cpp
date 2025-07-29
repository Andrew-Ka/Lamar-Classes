//client
#include <iostream>
#ifdef __WIN32__
    #include <winsock2.h>
#else  
    #include <sys/socket.h>
#endif
//https://stackoverflow.com/questions/46131657/getting-socket-header-files
#include <unistd.h>


using namespace std;

int main(int argc, char* argv[]){
    cout << "Running client...";
    int clientSocket = socket(AF_INET, SOCK_STREAM, 0);
    
    //addressing
    sockaddr_in serverAddress;
    serverAddress.sin_family = AF_INET;
    serverAddress.sin_port = htons(8080);
    serverAddress.sin_addr.s_addr = INADDR_ANY;
    
    //sending connection request
    connect(clientSocket, (struct sockaddr*)&serverAddress,
            sizeof(serverAddress));

    // sending data
    const char* message = "Hello, server!";
    send(clientSocket, message, strlen(message), 0);

    // closing socket
    close(clientSocket);
    
    return 0;
}