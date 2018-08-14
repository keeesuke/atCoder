import itertools as it

N = int(input())
S = [input() for i in range(N)]

# 各アルファベットの出現回数を記録する
HeadCharCnt = [0 for i in range(5)]
MARCH = 'MARCH'

for i in range(N):
    whichChar = MARCH.find(S[i][0])
    if whichChar != -1:
        HeadCharCnt[whichChar] += 1

# 違う頭文字で始まる3人のグループ数は
# 出現回数から3つとって掛け合わせ足し上げれば求まる
HeadCharCntPos = [] # 全く出現しなかった文字は無視
for j in HeadCharCnt:
    if j > 0:
        HeadCharCntPos.append(j)

# itertoolsのcombinations関数で
# 長さが3の全ての組み合わせを作る
validComb = list(it.combinations(HeadCharCntPos, 3))

# 掛け合わせ足し上げる
ans = 0
for v in validComb:
    ans = ans + v[0] * v[1] * v[2]

print(ans)
