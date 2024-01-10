class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}
        answer = list()

        for num in nums:
            if map.get(num) is None:
                map[num] = 1
            else:
                map[num] += 1

        ordered_map = sorted(map.items(), key=lambda item: item[1], reverse=True)
        top_k_items =  ordered_map[:k]

        for key, value in top_k_items:
            answer.append(key)


        return answer

