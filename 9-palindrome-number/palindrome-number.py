class Solution:
    def isPalindrome(self, x: int) -> bool:
        r=str(x)
        rev = r[::-1]
        if r==rev:
           return True
        else:
           return False
        