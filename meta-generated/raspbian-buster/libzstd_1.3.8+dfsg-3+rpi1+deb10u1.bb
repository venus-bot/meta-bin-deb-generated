PACKAGES = "${PN} libzstd1"
PROVIDES = "libzstd1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libz/libzstd/libzstd1_1.3.8+dfsg-3+rpi1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libzstd1 = "libzstd1_1.3.8+dfsg-3+rpi1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "110cd98b76279accf02b5359a117da87d2c7490619dcb8ecf82bb322e11c0fe1"
SRC_URI[deb0.md5sum] = "f850173c088759f53d92a9285aaaec91"

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
