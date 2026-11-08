import kotlin.random.Random
import kotlin.system.exitProcess
import java.io.IOException

fun clear() {
    try {
        if (System.getProperty("os.name").lowercase().contains("win")) {
            ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
        } else {
            ProcessBuilder("clear").inheritIO().start().waitFor()
        }
    } catch (e: IOException) {
        // ignore
    }
}

fun main() {
    var tex = 0
    var d = 0.0
    var iron = 0
    var oss = 0

    val scanner = java.util.Scanner(System.`in`)

    while (true) {
        println("mur-service release V6.1 (OS)")
        print("1: sell, 2: check the site, 3: exit, 4: check the cash register, 5: Promo, 6: pet Filya, 7: shop for Filya, antivirus, poison, de (delete everything), 8: create OS: ")
        val v = scanner.nextLine()

        when (v) {
            "1" -> {
                println("what to sell?\n1: samsung\n2: apple\n3: Redmi\n4: Macbook\n5: Alcatel\nos:  ")
                val b = scanner.nextLine()
                when (b) {
                    "1" -> {
                        d += 12000
                        println("you sold Samsung for 12,000 mur money")
                        tex += 1
                        Thread.sleep(900)
                        clear()
                    }
                    "2" -> {
                        d += 50000
                        println("you sold Apple for 50,000 mur money")
                        tex += 1
                        Thread.sleep(900)
                        clear()
                    }
                    "3" -> {
                        d += 13000
                        println("you sold Redmi for 13,000")
                        tex += 1
                        Thread.sleep(900)
                        clear()
                    }
                    "4" -> {
                        d += 70000
                        tex += 1
                        println("you sold Macbook for 70,000")
                        Thread.sleep(900)
                        clear()
                    }
                    "5" -> {
                        d += 4000
                        tex += 1
                        println("you sold Alcatel for 4,000")
                        Thread.sleep(900)
                        clear()
                    }
                    "os" -> {
                        if (oss >= 1) {
                            print("price (up to 1000)")
                            val sena = scanner.nextLine()
                            if (sena.all { it.isDigit() } && sena.isNotEmpty() && sena.toInt() in 1..1000) {
                                d += sena.toInt()
                                oss -= 1
                            }
                        } else {
                            println("you don't have an OS")
                        }
                    }
                }
            }
            "2" -> {
                clear()
                println("you have $d, you're making progress")
            }
            "3" -> {
                println("Bye! You have $d")
                break
            }
            "4" -> {
                clear()
                println("the cash register has $d")
            }
            "5" -> {
                print("enter promo code: ")
                val p = scanner.nextLine()
                when (p) {
                    "Filya TOP" -> d += 100000
                    "one" -> d += 1
                    "DeepSeek TOP" -> d += 100000
                    "Egor TOP" -> d += 100000
                    "Yandex Alice TOP" -> d += 100000
                    "Godzik TOP" -> d += 100000
                    "Sima TOP" -> d += 100000
                }
            }
            "report" -> {
                println("you have $d mur money, and $tex pieces of tech sold, petted Filya $iron times")
            }
            "6" -> {
                clear()
                println("Mur😺")
                Thread.sleep(500)
                println("mur😺")
                Thread.sleep(700)
                iron += 1
                d += 1000
                Thread.sleep(800)
                clear()
            }
            "7" -> {
                print("1: fish 100, 2: mur mint 1% 700, 3: fillet for Filya 1000: ")
                val f = scanner.nextLine()
                when (f) {
                    "1" -> {
                        if (d >= 100) {
                            d -= 100
                            println("you bought a fish\nMurr")
                            d += Random.nextInt(100, 201)
                            Thread.sleep(700)
                            clear()
                        }
                    }
                    "2" -> {
                        if (d >= 700) {
                            d -= 700
                            println("you bought mur mint\nMURRRRRRRR\nSHHH\nMeow")
                            Thread.sleep(700)
                            clear()
                        }
                    }
                    "3" -> {
                        if (d >= 1000) {
                            d -= 1000
                            println("you bought a fillet\nmur meoww")
                            Thread.sleep(700)
                            clear()
                        }
                    }
                }
            }
            "antivirus" -> {
                clear()
                repeat(100) {
                    Thread.sleep(500)
                    println("\u001B[91mHAhaHahA\u001B[5m")
                    d = Double.NEGATIVE_INFINITY
                }
            }
            "poison" -> {
                repeat(100) {
                    Thread.sleep(100)
                    d -= 0.5
                    println("-0.5")
                }
            }
            "de" -> {
                d = 0.0
                tex = 0
                iron = 0
                println("Done $d,$tex,$iron")
            }
            "8" -> {
                print("name: ")
                val nameos = scanner.nextLine()
                print("linux/windows/yours: ")
                val linuxwindows = scanner.nextLine()
                println("$nameos $linuxwindows")
                oss += 1
            }
            else -> {
                println("unknown command")
                Thread.sleep(900)
                clear()
            }
        }
    }
}