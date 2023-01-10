PACKAGES = "${PN} libtasn1-6"
PROVIDES = "libtasn1-6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libt/libtasn1-6/libtasn1-6_4.13-3+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-6 = "libtasn1-6_4.13-3+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "997fa644d1aeaa826f7a273841abfe0667a11a14d68b8b4e9dd218077708d531"
SRC_URI[deb0.md5sum] = "2f012e43369f52d4ef7b765623e7c4a8"

RDEPENDS_${PN} = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6.5.5 \
    ./usr/share/doc/libtasn1-6/AUTHORS \
    ./usr/share/doc/libtasn1-6/README \
    ./usr/share/doc/libtasn1-6/THANKS \
    ./usr/share/doc/libtasn1-6/changelog.Debian.gz \
    ./usr/share/doc/libtasn1-6/changelog.gz \
    ./usr/share/doc/libtasn1-6/copyright\
"
