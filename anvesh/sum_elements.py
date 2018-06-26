def sum_of_two_elements(A,x):
    for i in A:
        if (x-i) in A and x-i != i:
            print(i,x-i)
            return
    print("Not found")

sum_of_two_elements(set([1,2,3,4,6,6,7]),111)

