class Solution:
    # Approach 1:
    # Convert to Binary: The toBit method turns a number into its binary form as a list of bits (0s and 1s).
    # Equalize Length: In minBitFlips, both start and goal are converted to binary. If their lengths differ, the shorter one is padded with zeros.
    # Count Flips: The method compares each bit in both binary lists. A bit flip is counted whenever the bits differ. The total count gives the number of flips needed.


    def toBit(self, num: int) -> list:
        bit_list = []  # Avoid naming variables as 'list' since it's a built-in Python type
        while num != 0:
            bit_list.insert(0, num % 2)  # This handles both 0 and 1 cases
            num = num // 2
        return bit_list

    def minBitFlips(self, start: int, goal: int) -> int:
        # Call toBit using self
        num1 = self.toBit(start)
        num2 = self.toBit(goal)
        
        # Make lengths equal by padding with zeros
        if len(num1) > len(num2):
            for _ in range(len(num1) - len(num2)):
                num2.insert(0, 0)
        elif len(num1) < len(num2):
            for _ in range(len(num2) - len(num1)):
                num1.insert(0, 0)

        # Count the number of bit flips required
        count = 0
        for i in range(len(num1)):
            if num1[i] != num2[i]:
                count += 1

        return count
    


    # Approach 2:
    
    # def toBit(self, num: int) -> list:
    #     bits = []
    #     while num:
    #         bits.insert(0, num % 2)
    #         num //= 2
    #     return bits

    # def padBits(self, num1: list, num2: list) -> tuple:
    #     max_len = max(len(num1), len(num2))
    #     num1 = [0] * (max_len - len(num1)) + num1
    #     num2 = [0] * (max_len - len(num2)) + num2
    #     return num1, num2

    # def minBitFlips(self, start: int, goal: int) -> int:
    #     num1 = self.toBit(start)
    #     num2 = self.toBit(goal)
    #     num1, num2 = self.padBits(num1, num2)
    #     return sum(1 for i in range(len(num1)) if num1[i] != num2[i])
