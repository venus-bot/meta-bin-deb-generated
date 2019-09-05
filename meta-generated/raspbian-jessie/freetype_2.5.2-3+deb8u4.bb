PACKAGES = "${PN} libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/freetype/libfreetype6_2.5.2-3+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.5.2-3+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "f8985b259dbccf0eaa6ec5ed793030434651556bb951f46cc4eff1af6b3e3743"
SRC_URI[deb0.md5sum] = "b79ea1c1aa07263eb023937f8fd4e7e4"

RDEPENDS_lib${PN}6 = "libc6 (>= 2.11) libpng12-0 (>= 1.2.13-4) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libpng12-0 zlib1g"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libfreetype6 = " \
    ./usr/lib/arm-linux-gnueabihf/libfreetype.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libfreetype.so.6.11.1 \
    ./usr/share/doc/libfreetype6/CHANGES.gz \
    ./usr/share/doc/libfreetype6/FTL.TXT.gz \
    ./usr/share/doc/libfreetype6/TODO \
    ./usr/share/doc/libfreetype6/changelog.Debian.gz \
    ./usr/share/doc/libfreetype6/changelog.gz \
    ./usr/share/doc/libfreetype6/copyright \
    ./usr/share/doc/libfreetype6/ft2faq.html \
    ./usr/share/doc/libfreetype6/pcf/README\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
