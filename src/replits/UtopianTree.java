package replits;

public class UtopianTree {
    public static void main(String[] args) {


    int year=0;
    int treeSize=0;

    for(int i =1 ; i<=3 ;i++){
        int growth=1;
        year +=1;
        treeSize +=growth;
        System.out.println("year "+year +" - "+growth+" cm\ntree size: "+treeSize+" cm");
    }


    for(int i =4 ; i<=10 ;i++){
        int growth=2;
        year +=1;
        treeSize +=growth;
        System.out.println("year "+year +" - "+growth+" cm\ntree size: "+treeSize+" cm");
    }


}
}

