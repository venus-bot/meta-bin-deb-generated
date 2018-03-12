PACKAGES = "${PN} libpixman-1-0"
PROVIDES = "libpixman-1-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pixman/libpixman-1-0_0.32.6-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpixman-1-0 = "libpixman-1-0_0.32.6-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "2a859af99ce3e90ebd06ce39acad0bb21ca345410cb3f5d524b74e4150edbbb9"
SRC_URI[deb0.md5sum] = "7a135ea336ae0766e66de1cdf8b4fedd"

RDEPENDS_lib${PN}-1-0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpixman-1-0 = " \
    ./usr/share/lintian/overrides/libpixman-1-0 \
    ./usr/share/doc/libpixman-1-0/changelog.gz \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0.32.6 \
    ./usr/share/doc/libpixman-1-0/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0 \
    ./usr/share/doc/libpixman-1-0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
