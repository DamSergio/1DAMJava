package numbers;

public class IsPalindrome{
	public boolean isPalindrome(int x) {
		int aux = x;
		int pal = 0;
		
		while (aux > 0) {
			pal *=10;
			pal += aux%10;
			aux /= 10; 
		}
		
		if (pal == x) {
			return true;
		}
		
        return false;
    }
}