PACKAGES = "${PN} libunistring2"
PROVIDES = "libunistring2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libu/libunistring/libunistring2_0.9.10-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libunistring2 = "libunistring2_0.9.10-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "ad7fe10cbd4ab16386048a9ccda2c21585a43824eb4da73c5c62493fca2f6616"
SRC_URI[deb0.md5sum] = "54032a985755c1787778826333c7c5ee"

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
