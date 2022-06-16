/*From a given vertex in a weighted connected graph, find shortest paths to other vertices using Dijkstra’s algorithm.
This Program is written by Pradyoth P, 4NI19IS062 from ISE 'A' Section. */
#include<iostream>
using namespace std;
void dijkstra(int n, int v, int cost[10][10],int dist[10])
{  int count, u, i, w, visited[10], min;
   for(i=0;i<n;i++)
   {
     visited[i]=0;
     dist[i]=cost[v][i];
   }
   visited[v]=1;dist[v]=1;count=2;
   while(count<=n)
   {
     min=999;
   for(w=0;w<n;w++)
     if((dist[w]<min) && (visited[w]!=1))
      {
        min=dist[w];
        u=w;
      }
   visited[u]=1;
   count++;
   for(w=0;w<n;w++)
   if((dist[u]+cost[u][w]<dist[w]) && (visited[w]!=1))
     dist[w]=dist[u]+cost[u][w];
   }
}
int main()
{ int n, v, cost[10][10], dist[10], i, j; 
  cout<<"Enter number of vertices:";
  cin>>n;
  cout<<"\nEnter cost matrix (for infinity, enter 999):\n";
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
       cin>>cost[i][j];
  cout<<"\nEnter source vertex:";
  cin>>v;
  dijkstra(n,v,cost,dist);
  cout<<"\nShortest path from \n";
  for(i=0;i<n;i++)
   if(i!=v)
     cout<<"\n"<<v<<" -> "<<i<<" = "<<dist[i]<<endl;
  return 0;
}