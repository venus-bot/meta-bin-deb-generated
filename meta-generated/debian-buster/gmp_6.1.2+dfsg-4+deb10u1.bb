PACKAGES = "${PN} libgmp10"
PROVIDES = "libgmp10"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gmp/libgmp10_6.1.2+dfsg-4+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_6.1.2+dfsg-4+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "2016e90ef0c05d207360625b2e013ae872db190d7e7055e198027ee6bfd43254"
SRC_URI[deb0.md5sum] = "1dd38c3134be71393f22e25c203a837f"

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
