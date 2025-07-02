class hollow{
    public static void main(String[] args) {
        for(int i=1;i<=15;i++){
         var n="";
        for(int j=1;j<=15;j++){
            if(i==1 || i==15 || j==1 || j==15){
                n=n+"*"+" "+" ";
            }
            else{
                n=n+"   ";
            }
        }
        System.out.println(n);
    }

}
    }
