class Solution:

    def encode(self, strs: List[str]) -> str:
        if not strs:
            return ""

        sizes = []
        for s in strs:
            sizes.append(str(len(s)))   # ["4", "4", "4"]

        encoded = ",".join(sizes) + "#"     # "4,4,4#" string

        for s in strs:
            encoded += s        # "4,4,4#neetcodelove"  # indicates end of lengths
        
        return encoded
        
    def decode(self, s: str) -> List[str]:
        if not s:
            return []

        i = 0
        while s[i] != '#':  
            i += 1
        
        length_section = s[:i]  # extracts all characters from beginning without # i.e "4,4,4"

        sizes = []
        for x in length_section.split(","):
            sizes.append(int(x))            # sizes = [4, 4, 4]
        
        result = []
        
        j = i + 1   # j = 6 starting after #
        
        for size in sizes:
            result.append(s[j:j+size])
            j += size
            
        return result
        

