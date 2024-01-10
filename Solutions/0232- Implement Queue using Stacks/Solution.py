class MyQueue:

    def __init__(self):
        self.main_stack = []
        self.temp_stack = []

    def push(self, x: int) -> None:
        self.main_stack.append(x)

    def pop(self) -> int:
        number = self.main_stack[0]
        del self.main_stack[0]

        return number


    def peek(self) -> int:
        return self.main_stack[0]

    def empty(self) -> bool:
        return len(self.main_stack) == 0