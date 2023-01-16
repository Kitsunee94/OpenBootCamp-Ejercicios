const fibonacci = n => {
    const fib = [0, 1]
    for (let i = 2; i < n; i++){
    fib[i]= fib[i-2]+ fib[i-1]
    }
    return fib[n]
}

fibonacci(2)
fibonacci(3)
fibonacci(4)
fibonacci(5)
fibonacci(6)
fibonacci(7)
fibonacci(8)
fibonacci(9)
fibonacci(10)
