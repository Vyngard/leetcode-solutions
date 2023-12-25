class MyQueue:

    def __init__(self):
        self.main_stack = []
        self.temp_stack = []

    def push(self, x: int) -> None:
        self.main_stack.append(x)

    def pop(self) -> int:
        size = len(self.main_stack)
        for i in range(0,size-1):
            self.temp_stack.append(self.main_stack.pop())

        number = self.main_stack.pop()

        size = len(self.temp_stack)
        for i in range(0, size):
            self.main_stack.append(self.temp_stack.pop())

        return number


    def peek(self) -> int:
        size = len(self.main_stack)
        for i in range(0, size - 1):
            self.temp_stack.append(self.main_stack.pop())

        number = self.main_stack.pop()
        self.temp_stack.append(number)

        size = len(self.temp_stack)
        for i in range(0, size):
            self.main_stack.append(self.temp_stack.pop())
        return number

    def empty(self) -> bool:
        return len(self.main_stack) == 0