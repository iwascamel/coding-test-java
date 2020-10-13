package AlgorithmLecture;

class unionFind{
    int getUnion(int a[],int x){
        if(a[x]==x){
            return x;
        }
        return a[x] = getUnion(a,a[x]);
    }
    void union(int parent[],int a,int b){
        a= getUnion(parent,a);
        b= getUnion(parent,b);
        if(b>a){
            parent[a]=b;
        }else
        {
            parent[b]=a;
        }
    }
}

public class kruskal {

}
