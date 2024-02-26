def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

for num in range(1, 16):
    if is_prime(num):
        print(num, "is prime")
    else:
        print(num, "is not prime")