PACKAGES = "${PN} libgmp10"
PROVIDES = "libgmp10"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gmp/libgmp10_6.1.2+dfsg-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_6.1.2+dfsg-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "ca3cd65e915de80716dd976fd9e6b9588342e39117ec07ac5a00e60bcb1a27df"
SRC_URI[deb0.md5sum] = "350adbf187c4095667843c1455c3acc4"

RDEPENDS_lib${PN}10 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_libgmp10 = " \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10 \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10.3.2 \
    ./usr/share/doc/libgmp10/README.Debian \
    ./usr/share/doc/libgmp10/changelog.Debian.gz \
    ./usr/share/doc/libgmp10/copyright\
"
