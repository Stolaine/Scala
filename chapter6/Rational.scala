import scala.language.implicitConversions

class Rational(n: Int, d: Int) {
    require(d!=0)
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n/g
    val denom: Int = d/g

    def this(n: Int) =
        this(n, 1)
    
    override def toString =
        s"$numer/$denom"

    def + (that: Rational): Rational =
        new Rational(
            numer * that.denom + denom * that.numer,
            denom * that.denom
        )
    
    def + (that: Int): Rational =
        this + new Rational(that)
    
    def - (that: Rational): Rational =
        new Rational(
            numer * that.denom - denom * that.numer,
            denom * that.denom
        )
    
    def - (that: Int): Rational =
        this - new Rational(that)
    
    def * (that: Rational): Rational =
        new Rational (
            numer * that.numer, denom * that.denom
        )
    
    def * (that: Int): Rational =
        this * new Rational(that)
    
    def / (that: Rational): Rational =
        this * new Rational(that.denom, that.numer)
    
    def / (that: Int): Rational =
        this / new Rational(that)

    def lessThan(that: Rational): Boolean =
        this.numer * that.denom < this.denom * that.numer

    def max(that: Rational): Rational =
        if (this lessThan that) that else this
    
    private def gcd(a: Int, b: Int): Int =
        if (b == 0) a else gcd(b, a % b)
    
    implicit def intToRational(x: Int) =
        new Rational(x)
}