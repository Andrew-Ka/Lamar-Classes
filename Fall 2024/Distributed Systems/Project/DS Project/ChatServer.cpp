//server
#include <iostream>
#ifdef __WIN32__
    #include <winsock2.h>
#else  
    #include <sys/socket.h>
#endif
//https://stackoverflow.com/questions/46131657/getting-socket-header-files
#include <unistd.h>
using namespace std;

int main(int argc, char* argv[]) {
    cout << "Running server...";
    

    //from GfG
    int serverSocket = socket(AF_INET, SOCK_STREAM, 0);
    //AF_INET is the protocol, IPv4
    //SOCK_STREAM is the TCP type socket (reliable)
    //0 is integer for...

    sockaddr_in serverAddress;
    //object sockaddr_in, var name serverAddress
    serverAddress.sin_family = AF_INET;
    serverAddress.sin_port = htons(8080); //idk
    serverAddress.sin_addr.s_addr = INADDR_ANY;


    //time to bind
    bind(serverSocket, (struct sockaddr*)&serverAddress, sizeof(serverAddress));

    //listen in for requests
    listen(serverSocket, 5);

    //accept connection request
    int clientSocket = accept(serverSocket, nullptr, nullptr);

    //receive data
    char buffer[1000] = {0}; //initialize buffer
    recv(clientSocket, buffer, sizeof(buffer), 0);
    cout << "Message from client: "<< buffer <<endl;

    //close socket
    close(serverSocket);

    return 0;

}