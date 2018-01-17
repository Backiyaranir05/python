class PrimeIter:
    def __init__(self):
        self.current = 1

    def next(self):
        self.current = self.current + 1
        while 1:
            for i in range(2, self.current/2 + 1):
                if self.current % i == 0:
                    self.current = self.current + 1
                    break 
            else:
                break 
        return self.current

    def __iter__(self):
        return self

if __name__ == '__main__':
    p = PrimeIter()
    for p in range (5):
        print p
