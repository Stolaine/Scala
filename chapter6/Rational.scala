class Rational(n: Int, d: Int) {
    require(d!=0)
    val numer: Int = n
    val denom: Int = d

    def this(n: Int) = this(n, 1)
    
    override def toString = s"$n/$d"

    def add(that: Rational): Rational = {
        new Rational(
            numer * that.denom + denom * that.numer,
            denom * that.denom
        )
    }

    def lessThan(that: Rational): Boolean = {
        this.numer * that.denom < this.denom * that.numer
    }

    def max(that: Rational): Rational = {
        if (this lessThan that) that else this
    }
}