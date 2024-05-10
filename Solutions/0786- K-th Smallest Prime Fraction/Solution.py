class Solution:
    def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
        fractions = []
        fraction_map = {}

        for i in range(len(arr)):
            for j in range(i + 1, len(arr)):
                fraction = arr[i] / arr[j]
                fractions.append(fraction)
                fraction_map[fraction] = (arr[i], arr[j])

        fractions.sort()
        return fraction_map[fractions[k - 1]]