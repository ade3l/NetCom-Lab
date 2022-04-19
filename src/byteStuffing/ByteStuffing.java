package byteStuffing;

import java.util.Scanner;

public class ByteStuffing {
    public static void main(String[] args) {
        String messageToSend;
        Scanner input = new Scanner(System.in);
        messageToSend = input.nextLine();
        String stuffedMessage="F";
        for(char c: messageToSend.toCharArray()){
            if(c=='F' || c=='E'){
                stuffedMessage+="E";
            }
            stuffedMessage+=c;
        }
        stuffedMessage+="F";
        System.out.println(stuffedMessage);
        String destuffedMessage = "";
        for(int i=1; i<stuffedMessage.length()-1; i++){
            if(stuffedMessage.charAt(i) == 'D' || stuffedMessage.charAt(i)=='F')
                destuffedMessage+=stuffedMessage.charAt(i);
            else if(stuffedMessage.charAt(i)=='E' && stuffedMessage.charAt(i+1)=='E'){
                destuffedMessage+='E';
                i++;
            }
        }
        System.out.println(destuffedMessage);
    }
}
