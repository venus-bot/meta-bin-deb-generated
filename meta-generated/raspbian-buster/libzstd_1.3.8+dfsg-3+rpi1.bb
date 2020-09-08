PACKAGES = "${PN} libzstd1"
PROVIDES = "libzstd1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libz/libzstd/libzstd1_1.3.8+dfsg-3+rpi1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libzstd1 = "libzstd1_1.3.8+dfsg-3+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "250e609240c682a90b85f2d90024acc63bd0b3f586699929246c1a5d4ba0458c"
SRC_URI[deb0.md5sum] = "e7b0af3af434ad7ee87ce63d5dea3036"

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
