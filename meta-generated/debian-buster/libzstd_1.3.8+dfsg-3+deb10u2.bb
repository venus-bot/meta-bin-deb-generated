PACKAGES = "${PN} libzstd1"
PROVIDES = "libzstd1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libz/libzstd/libzstd1_1.3.8+dfsg-3+deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libzstd1 = "libzstd1_1.3.8+dfsg-3+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "e3acbac5f15b54f0d3ff99323c84c48a13476c76b3bd3aa297d331c9721b6fcd"
SRC_URI[deb0.md5sum] = "98ae62a83070dec7bf6934e5f73dd252"

RDEPENDS_${PN}1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libzstd1 = " \
    ./usr/lib/arm-linux-gnueabihf/libzstd.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libzstd.so.1.3.8 \
    ./usr/share/doc/libzstd1/changelog.Debian.gz \
    ./usr/share/doc/libzstd1/changelog.gz \
    ./usr/share/doc/libzstd1/copyright\
"
