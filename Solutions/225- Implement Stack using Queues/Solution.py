class MyStack:

    def __init__(self):
        self.main_queue = []
        self.temp_queue = []

    def push(self, x: int) -> None:
        self.main_queue.append(x)

    def pop(self) -> int:
        return self.main_queue.pop()

    def top(self) -> int:
        return self.main_queue[-1]

    def empty(self) -> bool:
        return len(self.main_queue) == 0