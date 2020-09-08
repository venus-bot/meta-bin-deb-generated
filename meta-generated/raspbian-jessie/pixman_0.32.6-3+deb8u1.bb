PACKAGES = "${PN} libpixman-1-0"
PROVIDES = "libpixman-1-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pixman/libpixman-1-0_0.32.6-3+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpixman-1-0 = "libpixman-1-0_0.32.6-3+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "ce0550de7fd069d6c2a4fda1a0f990bcc28868661b1157b09ffdc2cfe84ed773"
SRC_URI[deb0.md5sum] = "e2eae2276847f2a7fd2e18e646186181"

RDEPENDS_lib${PN}-1-0 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libpixman-1-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0.32.6 \
    ./usr/share/doc/libpixman-1-0/changelog.Debian.gz \
    ./usr/share/doc/libpixman-1-0/changelog.gz \
    ./usr/share/doc/libpixman-1-0/copyright \
    ./usr/share/lintian/overrides/libpixman-1-0\
"
