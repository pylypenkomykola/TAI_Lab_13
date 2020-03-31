var Complex = /** @class */ (function () {
    function Complex(real, imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex.prototype.add = function (obj) {
        return new Complex(this.real + obj.real, this.imaginary + obj.imaginary);
    };
    Complex.prototype.subtract = function (obj) {
        return new Complex(this.real - obj.real, this.imaginary - obj.imaginary);
    };
    Complex.prototype.module = function () {
        return Math.sqrt((this.real ^ 2) + (this.imaginary ^ 2));
    };
    Complex.prototype.toString = function () {
        console.log('real: ', this.real, 'img: ', this.imaginary);
    };
    return Complex;
}());
var a = new Complex(3, 2);
var b = new Complex(5, 4);
var c = a.add(b);
c.toString();
var d = c.subtract(a);
d.toString();
var e = d.module();
console.log('result of module: ', e);
