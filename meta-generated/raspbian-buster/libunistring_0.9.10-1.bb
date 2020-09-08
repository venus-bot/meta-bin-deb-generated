PACKAGES = "${PN} libunistring2"
PROVIDES = "libunistring2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libu/libunistring/libunistring2_0.9.10-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libunistring2 = "libunistring2_0.9.10-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "7e9a8046fde4a3471e9f5477bdcecd079e423aff2b916791e0d4a224e5a6c999"
SRC_URI[deb0.md5sum] = "63b3395df43457c1d152ccd676f8c5ba"

RDEPENDS_${PN}2 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libunistring2 = " \
    ./usr/lib/arm-linux-gnueabihf/libunistring.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libunistring.so.2.1.0 \
    ./usr/share/doc/libunistring2/changelog.Debian.gz \
    ./usr/share/doc/libunistring2/changelog.gz \
    ./usr/share/doc/libunistring2/copyright\
"
