PACKAGES = "${PN} libsystemd0 libudev1"
PROVIDES = "libsystemd0 libudev1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_241-7~deb10u7+rpi1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libudev1_241-7~deb10u7+rpi1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsystemd0 = "libsystemd0_241-7~deb10u7+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "da0602ea8952fa2e4df02545209c26394a15d35b36bdb3556b2739ba5b7b729d"
SRC_URI[deb0.md5sum] = "f5806fd1a1b2651100df1e21e1affdde"
DEBFILENAME_libudev1 = "libudev1_241-7~deb10u7+rpi1_armhf.deb"
SRC_URI[deb1.sha256sum] = "3ed524b1903ebce0b47411726e12998bdafcde554d5bbc11588bf906f5571e5c"
SRC_URI[deb1.md5sum] = "421771e31aec471a8587885669083cee"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.28) libgcrypt20 (>= 1.8.0) liblz4-1 (>= 0.0~r122) liblzma5 (>= 5.1.1alpha+20120614)"
RDEPENDS_libudev1 = "libc6 (>= 2.28)"
DEPENDS = "libc6 libgcrypt20 liblz4-1 liblzma5"


inherit deb_group

FILES_libsystemd0 = " \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0 \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0.25.0 \
    ./usr/share/doc/libsystemd0/changelog.Debian.gz \
    ./usr/share/doc/libsystemd0/copyright\
"
FILES_libudev1 = " \
    ./lib/arm-linux-gnueabihf/libudev.so.1 \
    ./lib/arm-linux-gnueabihf/libudev.so.1.6.13 \
    ./usr/share/doc/libudev1/changelog.Debian.gz \
    ./usr/share/doc/libudev1/copyright\
"
