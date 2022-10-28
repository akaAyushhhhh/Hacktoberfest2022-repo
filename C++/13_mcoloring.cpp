#include<iostream>
#include<queue>
using namespace std;
bool isSafe(int node, vector<vector<int>>graph,vector<int>node_color, int totalnodes, int colorchoosen){
    for(int k=0;k<totalnodes;k++){
        if(graph[k][node]==1 && node_color[k]==colorchoosen){
            return false;
        }
    }
    return true;
}
bool solve(int node, vector<vector<int>>graph, int totalcolors, vector<int>node_color, int totalnodes){
    if(node==totalnodes){
        return true;
    }
    for(int col=1;col<=totalcolors;col++){
        if(isSafe(node,graph,node_color,totalnodes,col)){
            node_color[node]=col;
            if(solve(node+1,graph,totalcolors,node_color,totalnodes)){
                return true;
            }
            node_color[node]=0;
        }
    }
    return false;
}

int main(){
    int totalnodes=4;
    vector<vector<int>>graph = {
        { 0, 1, 1, 1 },
        { 1, 0, 1, 0 },
        { 1, 1, 0, 1 },
        { 1, 0, 1, 0 },
    };
    vector<int> node_color(totalnodes,0);
    int totalcolors = 3;
    if(solve(0,graph,totalcolors,node_color,totalnodes)){
        cout<<"True";
    }
    else{
        cout<<"False";
    }
}