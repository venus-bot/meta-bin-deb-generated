PACKAGES = "${PN} zlib1g zlib1g-dev"
PROVIDES = "zlib1g zlib1g-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/z/zlib/zlib1g_1.2.11.dfsg-1+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/z/zlib/zlib1g-dev_1.2.11.dfsg-1+deb10u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.11.dfsg-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "40eeb7d7595d7fdc3673699de0229d07a05678632dc9540e0e4d68fa18107689"
SRC_URI[deb0.md5sum] = "40332ac8345cce26d837bc2b7a672ba7"
DEBFILENAME_zlib1g-dev = "zlib1g-dev_1.2.11.dfsg-1+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "3126df5ef35999922799737495f159ad785a8a221bbc716ae6a53a560a879b0c"
SRC_URI[deb1.md5sum] = "6c696db84358f51c92bded93132e8e47"

RDEPENDS_${PN}1g = "libc6 (>= 2.4)"
RDEPENDS_${PN}1g-dev = "libc6-dev zlib1g (= 1:1.2.11.dfsg-1+deb10u1)"
DEPENDS = "libc6 libc6-dev"


inherit deb_group

FILES_zlib1g = " \
    ./lib/arm-linux-gnueabihf/libz.so.1 \
    ./lib/arm-linux-gnueabihf/libz.so.1.2.11 \
    ./usr/share/doc/zlib1g/changelog.Debian.gz \
    ./usr/share/doc/zlib1g/changelog.gz \
    ./usr/share/doc/zlib1g/copyright\
"
FILES_zlib1g-dev = " \
    ./usr/include/zconf.h \
    ./usr/include/zlib.h \
    ./usr/lib/arm-linux-gnueabihf/libz.a \
    ./usr/lib/arm-linux-gnueabihf/libz.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/zlib.pc \
    ./usr/share/doc/zlib1g-dev/FAQ.gz \
    ./usr/share/doc/zlib1g-dev/README.gz \
    ./usr/share/doc/zlib1g-dev/algorithm.txt.gz \
    ./usr/share/doc/zlib1g-dev/changelog.Debian.gz \
    ./usr/share/doc/zlib1g-dev/changelog.gz \
    ./usr/share/doc/zlib1g-dev/copyright \
    ./usr/share/doc/zlib1g-dev/examples/README.examples \
    ./usr/share/doc/zlib1g-dev/examples/enough.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/example.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/fitblk.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gun.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzappend.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzjoin.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzlog.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/gzlog.h.gz \
    ./usr/share/doc/zlib1g-dev/examples/infcover.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/minigzip.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/zlib_how.html \
    ./usr/share/doc/zlib1g-dev/examples/zpipe.c.gz \
    ./usr/share/doc/zlib1g-dev/examples/zran.c.gz \
    ./usr/share/doc/zlib1g-dev/txtvsbin.txt.gz \
    ./usr/share/man/man3/zlib.3.gz\
"
