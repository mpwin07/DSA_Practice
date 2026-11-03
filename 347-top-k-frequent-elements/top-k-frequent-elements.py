from collections import Counter
class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        ans = Counter(nums).most_common(k)
        f = []
        for d in ans:
            f.append(d[0])
        return f
        