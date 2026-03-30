class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack = []
        result = []
        open = 0
        close = 0

        def gen(open, close ):
            if open == close == n:
                result.append("".join(stack))
            if open < n:
                stack.append("(")
                gen(open + 1, close)
                stack.pop()
            if close < open:
                stack.append(")")
                gen(open, close + 1)
                stack.pop()
        
        gen(0,0)
        return result