class ComplexNumbers {
    private:
    	int real;
    	int imaginary;
    public:
    	ComplexNumbers(int real, int imaginary) {
            this -> real = real;
            this -> imaginary = imaginary;
        }
    
    	void plus(ComplexNumbers const &c2) {
            real = real + c2.real;
            imaginary = imaginary + c2.imaginary;
        }
    
    	void multiply(ComplexNumbers const &c2) {
            int newReal = (real * c2.real) - (imaginary*c2.imaginary);
            int newImaginary = (imaginary * c2.real) + (real * c2.imaginary);
            real = newReal;
            imaginary = newImaginary;
        }
    	
    	void print() {
            cout << real << " + i" << imaginary;
        }
};
