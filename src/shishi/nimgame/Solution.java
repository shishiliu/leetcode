package shishi.nimgame;

public class Solution {
    public boolean canWinNim(int n) {
        if(n<4){
            return true;
        }
        else {
            return n%4>0?true:false;    
        }
    }
}
