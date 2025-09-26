class Solution {
    public String convertDateToBinary(String date) {
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));
        StringBuilder word=new StringBuilder();
        word.append(Integer.toBinaryString(year));
        word.append("-");
                word.append(Integer.toBinaryString(month));

        word.append("-");
                word.append(Integer.toBinaryString(day));
                return word.toString();



        
    }
}