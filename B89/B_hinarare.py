N = int(input())
rawS = input()

# 他の三つの文字の存在は制約条件で保証されてるので
# Yの存在のみ確かめればOK
if rawS.find('Y') != -1:
    print('Four')
else:
    print('Three')
