class Solution(object):
    def isValidSudoku(self, board):
        # Tạo 9 set cho hàng, cột và ô vuông
        rowMap = [set() for _ in range(9)]
        colMap = [set() for _ in range(9)]
        square = [set() for _ in range(9)]

        for r in range(9):
            for c in range(9):
                num = board[r][c]
                if num == ".":
                    continue

                # Tính chỉ số của ô vuông 3x3
                boxIndex = (r // 3) * 3 + (c // 3)

                # Nếu số đã tồn tại trong hàng, cột hoặc ô vuông thì invalid
                if num in rowMap[r] or num in colMap[c] or num in square[boxIndex]:
                    return False

                # Nếu chưa có, thêm vào set
                rowMap[r].add(num)
                colMap[c].add(num)
                square[boxIndex].add(num)

        return True
