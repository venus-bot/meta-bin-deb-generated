PACKAGES = "${PN} libffi6"
PROVIDES = "libffi6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libf/libffi/libffi6_3.1-2+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libffi6 = "libffi6_3.1-2+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "76703fd86bbe062ac79d11192fa35fb0076ebc8782f02326261a88386d378fbe"
SRC_URI[deb0.md5sum] = "f99635fba0a0576318a2d4b7fa7a2a12"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) multiarch-support"
DEPENDS = "libc6 libgcc1 multiarch-support"


inherit deb_group

FILES_libffi6 = " \
    ./usr/lib/arm-linux-gnueabihf/libffi.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libffi.so.6.0.2 \
    ./usr/share/doc/libffi6/changelog.Debian.gz \
    ./usr/share/doc/libffi6/copyright\
"
