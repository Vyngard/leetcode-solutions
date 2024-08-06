class Solution:
    def minimumPushes(self, word: str) -> int:
        my_dict = Counter(word)

        if len(my_dict.keys()) < 9:
            return len(word)

        answer = 0
        sorted_keys = [key for key, value in sorted(my_dict.items(), key=lambda item: item[1], reverse=True)]
        for i in range(0,len(sorted_keys)):
            answer += my_dict[sorted_keys[i]] * (1 + (i // 8))
        
        return answer