package LamdaExpressions;

interface cab1 {
    public String bookCab(String src,String des);
}

/*class OLA implements cab1{

    @Override
    public String bookCab(String src, String des) {
        System.out.println("The cab is booked from "+src+" to "+des);
        return ("Price: 1000");

    }
}*/
class test1{
    
    public static void main(String[] args){
       /* cab1 cb = new OLA();
        String str = cb.bookCab("bang", "mys");
        System.out.println(str);*/

        cab1 cb = ((src, des) -> {
            System.out.println("The cab is booked from "+src+" to "+des);
            return "Price 5000 rs";
        });
        System.out.println(cb.bookCab("bang","mys"));
    }
}



