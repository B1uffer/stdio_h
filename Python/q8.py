lol = [[1,2,3],[4,5],[6,7,8,9]]
print(lol[0]) # [1,2,3]
print(lol[2][1]) # [7]
for sub in lol: # 여기서 [], [], [] 뽑아내고
   for item in sub: # 여기서 [] 안에 있는걸 순서대로 뽑아냄
      print(item, end=' ') # 1, 2, 3 뽑고 print()를 통해 줄넘기 후 4,5 이런식으로 감
   print()

for x in "hello":
   print(x)