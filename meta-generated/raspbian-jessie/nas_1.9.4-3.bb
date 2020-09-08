PACKAGES = "${PN} libaudio2"
PROVIDES = "libaudio2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/nas/libaudio2_1.9.4-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libaudio2 = "libaudio2_1.9.4-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "bc9266bad099ead346e45f0bd90d1581d1afae4a5b2e090c968d99549a9a69cb"
SRC_URI[deb0.md5sum] = "a9261cdfe33da6791e7a31c2f17dfeb8"

RDEPENDS_libaudio2 = "libc6 (>= 2.15) libxau6 libxt6 multiarch-support"
DEPENDS = "libc6 libxau6 libxt6 multiarch-support"


inherit deb_group

FILES_libaudio2 = " \
    ./usr/lib/arm-linux-gnueabihf/libaudio.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libaudio.so.2.4 \
    ./usr/share/doc/libaudio2/FAQ \
    ./usr/share/doc/libaudio2/README.gz \
    ./usr/share/doc/libaudio2/TODO \
    ./usr/share/doc/libaudio2/changelog.Debian.gz \
    ./usr/share/doc/libaudio2/changelog.gz \
    ./usr/share/doc/libaudio2/copyright \
    ./usr/share/libaudio2/AuErrorDB\
"
