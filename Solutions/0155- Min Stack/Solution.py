class MinStack:

    def __init__(self):
        self.main_stack = []
        self.min_stack = []
        self.min_stack.append(2147483648)

    def push(self, val: int) -> None:
        self.main_stack.append(val)

        if val <= self.min_stack[-1]:
            self.min_stack.append(val)


    def pop(self) -> None:
        number = self.main_stack.pop()

        if number == self.min_stack[-1]:
            self.min_stack.pop()

    def top(self) -> int:
        return self.main_stack[-1]

    def getMin(self) -> int:
        return self.min_stack[-1]