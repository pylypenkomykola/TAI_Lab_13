class Complex {
	private real: number;
	private imaginary: number;
	
	constructor(real: number, imaginary: number){
		this.real = real;
		this.imaginary=imaginary;
	}
	
	add(obj: Complex): Complex {
		return new Complex(this.real + obj.real, this.imaginary + obj.imaginary);
	}
	
	subtract(obj: Complex): Complex {
		return new Complex(this.real - obj.real, this.imaginary - obj.imaginary);
	}
	
	module(): number {
		return Math.sqrt((this.real^2)+(this.imaginary^2));
	}
	
	toString(){
		console.log('real: ',this.real,'img: ',this.imaginary);
	}
	
}

let a = new Complex(3,2);
let b = new Complex(5,4);

let c = a.add(b);

c.toString();

let d = c.subtract(a);
d.toString();

let e = d.module();

console.log('result of module: ',e);
