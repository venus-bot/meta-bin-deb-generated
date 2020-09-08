PACKAGES = "${PN} libpixman-1-0"
PROVIDES = "libpixman-1-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pixman/libpixman-1-0_0.32.6-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpixman-1-0 = "libpixman-1-0_0.32.6-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "2a859af99ce3e90ebd06ce39acad0bb21ca345410cb3f5d524b74e4150edbbb9"
SRC_URI[deb0.md5sum] = "7a135ea336ae0766e66de1cdf8b4fedd"

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
