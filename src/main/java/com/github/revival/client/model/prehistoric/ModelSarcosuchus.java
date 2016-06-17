package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

import com.github.revival.client.model.prehistoric.test.ModelNewPrehistoric;
import com.github.revival.server.entity.mob.EntitySarcosuchus;
import com.github.revival.server.entity.mob.EntitySpinosaurus;
import com.github.revival.server.entity.mob.test.EntityNewPrehistoric;

public class ModelSarcosuchus extends ModelNewPrehistoric {
	public AdvancedModelRenderer lowerBody;
	public AdvancedModelRenderer upperBody;
	public AdvancedModelRenderer tail1;
	public AdvancedModelRenderer OsteodermLowerRight;
	public AdvancedModelRenderer OsteodermLowerLeft;
	public AdvancedModelRenderer leftHindThigh;
	public AdvancedModelRenderer rightHindThigh;
	public AdvancedModelRenderer neck;
	public AdvancedModelRenderer OsteodermUpper;
	public AdvancedModelRenderer leftFrontThigh;
	public AdvancedModelRenderer rightFrontThigh;
	public AdvancedModelRenderer head;
	public AdvancedModelRenderer upperJaw;
	public AdvancedModelRenderer LowerJaw;
	public AdvancedModelRenderer upperJawBulb;
	public AdvancedModelRenderer Teethleft;
	public AdvancedModelRenderer Teethright;
	public AdvancedModelRenderer leftFrontLeg;
	public AdvancedModelRenderer leftFrontFoot;
	public AdvancedModelRenderer rightFrontLeg;
	public AdvancedModelRenderer rightFrontFoot;
	public AdvancedModelRenderer tail2;
	public AdvancedModelRenderer OsteodermTail1;
	public AdvancedModelRenderer tail3;
	public AdvancedModelRenderer OsteodermTail2;
	public AdvancedModelRenderer OsteodermTail3;
	public AdvancedModelRenderer leftHindLeg;
	public AdvancedModelRenderer leftHindFoot;
	public AdvancedModelRenderer rightHindLeg;
	public AdvancedModelRenderer rightHindFoot;
	public ModelAnimator animator;

	public ModelSarcosuchus() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.OsteodermTail2 = new AdvancedModelRenderer(this, 50, 100);
		this.OsteodermTail2.mirror = true;
		this.OsteodermTail2.setRotationPoint(0.0F, -1.7F, 4.0F);
		this.OsteodermTail2.addBox(-1.5F, -1.8F, -2.8F, 3, 2, 14, 0.0F);
		this.setRotateAngle(OsteodermTail2, 0.045553093477052F, 0.0F, 0.0F);
		this.leftFrontFoot = new AdvancedModelRenderer(this, 107, 2);
		this.leftFrontFoot.setRotationPoint(0.0F, 4.6F, -2.0F);
		this.leftFrontFoot.addBox(-2.0F, -0.7F, -3.0F, 4, 2, 5, 0.0F);
		this.setRotateAngle(leftFrontFoot, 0.17453292519943295F, 0.0F, 0.0F);
		this.upperJaw = new AdvancedModelRenderer(this, 0, 13);
		this.upperJaw.mirror = true;
		this.upperJaw.setRotationPoint(0.0F, -1.5F, -5.2F);
		this.upperJaw.addBox(-3.0F, -1.3F, -11.1F, 6, 4, 11, 0.0F);
		this.setRotateAngle(upperJaw, -0.045553093477052F, 0.0F, 0.0F);
		this.leftFrontLeg = new AdvancedModelRenderer(this, 70, 0);
		this.leftFrontLeg.setRotationPoint(0.3F, 3.5F, 1.2F);
		this.leftFrontLeg.addBox(-1.5F, 0.0F, -2.5F, 3, 5, 3, 0.0F);
		this.setRotateAngle(leftFrontLeg, -0.18203784098300857F, 0.0F, 0.0F);
		this.rightHindLeg = new AdvancedModelRenderer(this, 70, 10);
		this.rightHindLeg.mirror = true;
		this.rightHindLeg.setRotationPoint(-0.3F, 3.0F, 0.4F);
		this.rightHindLeg.addBox(-1.5F, 0.0F, -2.5F, 3, 5, 3, 0.0F);
		this.leftHindLeg = new AdvancedModelRenderer(this, 70, 10);
		this.leftHindLeg.setRotationPoint(0.3F, 3.0F, 0.4F);
		this.leftHindLeg.addBox(-1.5F, 0.0F, -2.5F, 3, 5, 3, 0.0F);
		this.OsteodermTail3 = new AdvancedModelRenderer(this, 0, 90);
		this.OsteodermTail3.mirror = true;
		this.OsteodermTail3.setRotationPoint(0.0F, -0.8F, 5.3F);
		this.OsteodermTail3.addBox(-0.5F, -4.2F, -3.5F, 1, 4, 19, 0.0F);
		this.tail3 = new AdvancedModelRenderer(this, 28, 70);
		this.tail3.mirror = true;
		this.tail3.setRotationPoint(0.0F, 0.7F, 13.1F);
		this.tail3.addBox(-2.5F, -1.7F, 0.0F, 5, 5, 21, 0.0F);
		this.setRotateAngle(tail3, 0.045553093477052F, 0.0F, 0.0F);
		this.OsteodermLowerRight = new AdvancedModelRenderer(this, 80, 90);
		this.OsteodermLowerRight.mirror = true;
		this.OsteodermLowerRight.setRotationPoint(0.0F, 0.2F, 4.7F);
		this.OsteodermLowerRight.addBox(-5.0F, -1.2F, -4.3F, 4, 2, 13, 0.0F);
		this.Teethright = new AdvancedModelRenderer(this, 0, 29);
		this.Teethright.mirror = true;
		this.Teethright.setRotationPoint(-2.6F, 2.5F, -9.3F);
		this.Teethright.addBox(-0.5F, -0.2F, -5.4F, 1, 1, 11, 0.0F);
		this.setRotateAngle(Teethright, 0.05235987755982988F, 0.0F, 0.0F);
		this.rightFrontThigh = new AdvancedModelRenderer(this, 90, 0);
		this.rightFrontThigh.mirror = true;
		this.rightFrontThigh.setRotationPoint(-6.0F, -2.0F, -5.6F);
		this.rightFrontThigh.addBox(-2.0F, 0.0F, -1.6F, 4, 5, 4, 0.0F);
		this.head = new AdvancedModelRenderer(this, 0, 0);
		this.head.mirror = true;
		this.head.setRotationPoint(0.0F, 0.9F, -7.3F);
		this.head.addBox(-4.0F, -3.5F, -5.4F, 8, 5, 7, 0.0F);
		this.setRotateAngle(head, -0.091106186954104F, 0.0F, 0.0F);
		this.rightFrontFoot = new AdvancedModelRenderer(this, 107, 2);
		this.rightFrontFoot.mirror = true;
		this.rightFrontFoot.setRotationPoint(0.0F, 4.6F, -2.0F);
		this.rightFrontFoot.addBox(-2.0F, -0.7F, -3.0F, 4, 2, 5, 0.0F);
		this.setRotateAngle(rightFrontFoot, 0.17453292519943295F, 0.0F, 0.0F);
		this.LowerJaw = new AdvancedModelRenderer(this, 0, 43);
		this.LowerJaw.mirror = true;
		this.LowerJaw.setRotationPoint(0.0F, 2.4F, 0.8F);
		this.LowerJaw.addBox(-3.0F, -0.6F, -18.7F, 6, 2, 19, 0.0F);
		this.setRotateAngle(LowerJaw, -0.136659280431156F, 0.0F, 0.0F);
		this.neck = new AdvancedModelRenderer(this, 35, 11);
		this.neck.mirror = true;
		this.neck.setRotationPoint(0.0F, -1.2F, -8.8F);
		this.neck.addBox(-3.5F, -2.5F, -8.0F, 7, 7, 9, 0.0F);
		this.setRotateAngle(neck, 0.091106186954104F, 0.0F, 0.0F);
		this.upperJawBulb = new AdvancedModelRenderer(this, 32, 0);
		this.upperJawBulb.mirror = true;
		this.upperJawBulb.setRotationPoint(0.0F, -0.6F, -10.4F);
		this.upperJawBulb.addBox(-3.5F, -1.3F, -5.0F, 7, 4, 5, 0.0F);
		this.setRotateAngle(upperJawBulb, 0.136659280431156F, 0.0F, 0.0F);
		this.rightHindThigh = new AdvancedModelRenderer(this, 90, 12);
		this.rightHindThigh.mirror = true;
		this.rightHindThigh.setRotationPoint(-7.0F, 2.4000000000000004F, 12.5F);
		this.rightHindThigh.addBox(-2.0F, 0.0F, -3.5F, 4, 5, 4, 0.0F);
		this.rightHindFoot = new AdvancedModelRenderer(this, 107, 10);
		this.rightHindFoot.mirror = true;
		this.rightHindFoot.setRotationPoint(0.0F, 4.6F, -2.0F);
		this.rightHindFoot.addBox(-2.0F, -0.7F, -3.0F, 4, 2, 5, 0.0F);
		this.rightFrontLeg = new AdvancedModelRenderer(this, 70, 0);
		this.rightFrontLeg.mirror = true;
		this.rightFrontLeg.setRotationPoint(-0.3F, 3.5F, 1.2F);
		this.rightFrontLeg.addBox(-1.5F, 0.0F, -2.5F, 3, 5, 3, 0.0F);
		this.setRotateAngle(rightFrontLeg, -0.18203784098300857F, 0.0F, 0.0F);
		this.leftFrontThigh = new AdvancedModelRenderer(this, 90, 0);
		this.leftFrontThigh.setRotationPoint(6.0F, -2.0F, -5.6F);
		this.leftFrontThigh.addBox(-2.0F, 0.0F, -1.6F, 4, 5, 4, 0.0F);
		this.upperBody = new AdvancedModelRenderer(this, 75, 27);
		this.upperBody.mirror = true;
		this.upperBody.setRotationPoint(0.0F, 4.4F, 0.1F);
		this.upperBody.addBox(-5.0F, -4.1F, -8.9F, 10, 8, 10, 0.0F);
		this.tail1 = new AdvancedModelRenderer(this, 87, 46);
		this.tail1.mirror = true;
		this.tail1.setRotationPoint(0.0F, 2.1F, 12.4F);
		this.tail1.addBox(-4.5F, -2.0F, 0.0F, 9, 8, 10, 0.0F);
		this.setRotateAngle(tail1, -0.091106186954104F, 0.0F, 0.0F);
		this.lowerBody = new AdvancedModelRenderer(this, 35, 34);
		this.lowerBody.mirror = true;
		this.lowerBody.setRotationPoint(0.0F, 12.4F, -3.5F);
		this.lowerBody.addBox(-6.0F, 0.0F, 0.0F, 12, 9, 13, 0.0F);
		this.OsteodermUpper = new AdvancedModelRenderer(this, 81, 71);
		this.OsteodermUpper.mirror = true;
		this.OsteodermUpper.setRotationPoint(0.0F, -3.8F, -5.2F);
		this.OsteodermUpper.addBox(-2.5F, -1.0F, -4.7F, 5, 2, 10, 0.0F);
		this.setRotateAngle(OsteodermUpper, 0.091106186954104F, 0.0F, 0.0F);
		this.leftHindFoot = new AdvancedModelRenderer(this, 107, 10);
		this.leftHindFoot.setRotationPoint(0.0F, 4.6F, -2.0F);
		this.leftHindFoot.addBox(-2.0F, -0.7F, -3.0F, 4, 2, 5, 0.0F);
		this.OsteodermLowerLeft = new AdvancedModelRenderer(this, 80, 90);
		this.OsteodermLowerLeft.mirror = true;
		this.OsteodermLowerLeft.setRotationPoint(0.0F, 0.2F, 4.7F);
		this.OsteodermLowerLeft.addBox(1.0F, -1.2F, -4.3F, 4, 2, 13, 0.0F);
		this.Teethleft = new AdvancedModelRenderer(this, 0, 29);
		this.Teethleft.setRotationPoint(2.6F, 2.5F, -9.3F);
		this.Teethleft.addBox(-0.5F, -0.2F, -5.4F, 1, 1, 11, 0.0F);
		this.setRotateAngle(Teethleft, 0.05235987755982988F, 0.0F, 0.0F);
		this.tail2 = new AdvancedModelRenderer(this, 2, 67);
		this.tail2.mirror = true;
		this.tail2.setRotationPoint(0.0F, 1.1F, 9.2F);
		this.tail2.addBox(-3.8F, -1.9F, 0.0F, 7, 6, 15, 0.0F);
		this.leftHindThigh = new AdvancedModelRenderer(this, 90, 12);
		this.leftHindThigh.setRotationPoint(7.0F, 2.4000000000000004F, 12.5F);
		this.leftHindThigh.addBox(-2.0F, 0.0F, -3.5F, 4, 5, 4, 0.0F);
		this.OsteodermTail1 = new AdvancedModelRenderer(this, 80, 107);
		this.OsteodermTail1.mirror = true;
		this.OsteodermTail1.setRotationPoint(0.0F, -1.7F, 4.0F);
		this.OsteodermTail1.addBox(-2.5F, -1.4F, -4.3F, 5, 2, 11, 0.0F);
		this.setRotateAngle(OsteodermTail1, -0.045553093477052F, 0.0F, 0.0F);
		this.tail2.addChild(this.OsteodermTail2);
		this.leftFrontLeg.addChild(this.leftFrontFoot);
		this.head.addChild(this.upperJaw);
		this.leftFrontThigh.addChild(this.leftFrontLeg);
		this.rightHindThigh.addChild(this.rightHindLeg);
		this.leftHindThigh.addChild(this.leftHindLeg);
		this.tail3.addChild(this.OsteodermTail3);
		this.tail2.addChild(this.tail3);
		this.lowerBody.addChild(this.OsteodermLowerRight);
		this.upperJaw.addChild(this.Teethright);
		this.upperBody.addChild(this.rightFrontThigh);
		this.neck.addChild(this.head);
		this.rightFrontLeg.addChild(this.rightFrontFoot);
		this.head.addChild(this.LowerJaw);
		this.upperBody.addChild(this.neck);
		this.upperJaw.addChild(this.upperJawBulb);
		this.lowerBody.addChild(this.rightHindThigh);
		this.rightHindLeg.addChild(this.rightHindFoot);
		this.rightFrontThigh.addChild(this.rightFrontLeg);
		this.upperBody.addChild(this.leftFrontThigh);
		this.lowerBody.addChild(this.upperBody);
		this.lowerBody.addChild(this.tail1);
		this.upperBody.addChild(this.OsteodermUpper);
		this.leftHindLeg.addChild(this.leftHindFoot);
		this.lowerBody.addChild(this.OsteodermLowerLeft);
		this.upperJaw.addChild(this.Teethleft);
		this.tail1.addChild(this.tail2);
		this.lowerBody.addChild(this.leftHindThigh);
		this.tail1.addChild(this.OsteodermTail1);
		this.updateDefaultPose();
		animator = ModelAnimator.create();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.lowerBody.render(f5);
		animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animator.update(entity);
		blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
		this.resetToDefaultPose();
		setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
		animator.setAnimation(EntitySarcosuchus.ATTACK_ANIMATION);
		animator.startKeyframe(5);
		ModelUtils.rotate(animator, head, -31F, 0, 0);
		ModelUtils.rotate(animator, head, 44F, 0, 0);
		ModelUtils.rotate(animator, neck, 5F, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(10);
		animator.setAnimation(EntitySarcosuchus.ROLL_ANIMATION);
		animator.startKeyframe(5);
		ModelUtils.rotate(animator, head, -31F, 0, 0);
		ModelUtils.rotate(animator, LowerJaw, 44F, 0, 0);
		ModelUtils.rotate(animator, neck, 5F, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(10);
		animator.startKeyframe(10);
		ModelUtils.rotate(animator, lowerBody, 180F, 0, 0);
		animator.move(lowerBody, 0, 10, 0);
		ModelUtils.rotate(animator, rightFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, rightHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightHindFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftHindFoot, 73F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(10);
		ModelUtils.rotate(animator, lowerBody, 360F, 0, 0);
		ModelUtils.rotate(animator, rightFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, rightHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightHindFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftHindFoot, 73F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(0);
		ModelUtils.rotate(animator, lowerBody, 0, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(10);
		ModelUtils.rotate(animator, lowerBody, 180F, 0, 0);
		animator.move(lowerBody, 0, 10, 0);
		ModelUtils.rotate(animator, rightFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, rightHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightHindFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftHindFoot, 73F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(10);
		ModelUtils.rotate(animator, lowerBody, 360F, 0, 0);
		ModelUtils.rotate(animator, rightFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftFrontThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftFrontFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, rightHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, rightHindFoot, 73F, 0, 0);
		ModelUtils.rotate(animator, leftHindThigh, 45F, 0, 0);
		ModelUtils.rotate(animator, leftHindFoot, 73F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(0);
		ModelUtils.rotate(animator, lowerBody, 0, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(10);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		AdvancedModelRenderer[] tailParts = { this.tail1, this.tail2, this.tail3 };
		AdvancedModelRenderer[] neckParts = { this.neck, this.head };
		float speed = 0.1F;
		float speed2 = 0.5F;
		this.bob(lowerBody, speed, 0.7F, false, entity.ticksExisted, 1);
		this.walk(leftFrontThigh, speed2, 0.6F, false, 0F, 0.4F, f, f1);
		this.walk(leftFrontLeg, speed2, 0.2F, false, 0F, -0.6F, f, f1);
		this.walk(leftFrontFoot, speed2, -0.6F, true, 2.5F, -0.4F, f, f1);
		this.walk(rightFrontThigh, speed2, 0.6F, true, 0F, -0.4F, f, f1);
		this.walk(rightFrontLeg, speed2, 0.2F, true, 0F, 0.6F, f, f1);
		this.walk(rightFrontFoot, speed2, -0.6F, false, 2.5F, 0.4F, f, f1);
		this.walk(leftHindThigh, speed2, 0.6F, true, 0F, 0.4F, f, f1);
		this.walk(leftHindLeg, speed2, 0.2F, true, 0F, -0.6F, f, f1);
		this.walk(leftHindFoot, speed2, -0.6F, false, 2.5F, -0.4F, f, f1);
		this.walk(rightHindThigh, speed2, 0.6F, false, 0F, -0.4F, f, f1);
		this.walk(rightHindLeg, speed2, 0.2F, false, 0F, 0.6F, f, f1);
		this.walk(rightHindFoot, speed2, -0.6F, true, 2.5F, 0.4F, f, f1);
		this.chainSwing(tailParts, speed, 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed2, 0.25F, -3, f, f1);
		this.chainWave(neckParts, speed, 0.15F, 3, entity.ticksExisted, 1);
		((EntityNewPrehistoric) entity).chainBuffer.applyChainSwingBuffer((AdvancedModelRenderer[]) tailParts);
		if (entity.riddenByEntity == null) {
			ModelUtils.faceTargetMod(neck, f3, f4, 0.5F);
			ModelUtils.faceTargetMod(head, f3, f4, 0.5F);
		}
		{
			float sitProgress = ((EntitySarcosuchus)entity).sitProgress;
			sitAnimationRotationPrev(rightHindLeg, sitProgress, (float)Math.toRadians(68.0D), 0, 0);
			sitAnimationRotationPrev(rightHindFoot, sitProgress, (float)Math.toRadians(38.0D), 0, 0);
			sitAnimationRotationPrev(OsteodermTail2, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
			sitAnimationRotationPrev(rightFrontFoot, sitProgress, (float)Math.toRadians(40.0D), 0, 0);
			sitAnimationRotationPrev(Teethright, sitProgress, (float)Math.toRadians(3.0D), 0, 0);
			sitAnimationRotationPrev(leftFrontFoot, sitProgress, (float)Math.toRadians(40.0D), 0, 0);
			sitAnimationRotationPrev(Teethleft, sitProgress, (float)Math.toRadians(3.0D), 0, 0);
			sitAnimationRotationPrev(rightHindThigh, sitProgress, (float)Math.toRadians(26.09D), 0, 0);
			sitAnimationRotationPrev(neck, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
			sitAnimationRotationPrev(upperBody, sitProgress, (float)Math.toRadians(5.22D), 0, 0);
			sitAnimationRotationPrev(upperJawBulb, sitProgress, (float)Math.toRadians(7.83D), 0, 0);
			sitAnimationRotationPrev(tail1, sitProgress, -((float)Math.toRadians(5.22D)), 0, 0);
			sitAnimationRotationPrev(leftHindFoot, sitProgress, (float)Math.toRadians(38.0D), 0, 0);
			sitAnimationRotationPrev(OsteodermUpper, sitProgress, (float)Math.toRadians(5.22D), 0, 0);
			sitAnimationRotationPrev(leftHindThigh, sitProgress, (float)Math.toRadians(26.0D), 0, 0);
			sitAnimationRotationPrev(LowerJaw, sitProgress, -((float)Math.toRadians(7.83D)), 0, 0);
			sitAnimationRotationPrev(rightFrontLeg, sitProgress, -((float)Math.toRadians(40.43D)), 0, 0);
			sitAnimationRotationPrev(upperJaw, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
			sitAnimationRotationPrev(tail3, sitProgress, (float)Math.toRadians(5.22D), 0, 0);
			sitAnimationRotationPrev(OsteodermTail1, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
			sitAnimationRotationPrev(head, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
			sitAnimationRotationPrev(leftFrontLeg, sitProgress, -((float)Math.toRadians(40.0D)), 0, 0);
			sitAnimationRotationPrev(leftHindLeg, sitProgress, (float)Math.toRadians(68.0D), 0, 0);
	        sitAnimationPos(lowerBody, sitProgress, 0, 3, 0);

		}
		{
			float sitProgress = ((EntitySarcosuchus)entity).sleepProgress;
			sitAnimationRotationPrev(OsteodermUpper, sitProgress, (float)Math.toRadians(5.22D), 0, 0);
	        sitAnimationRotationPrev(leftHindFoot, sitProgress, (float)Math.toRadians(38.0D), 0, 0);
	        sitAnimationRotationPrev(upperBody, sitProgress, (float)Math.toRadians(5.22D), 0, 0);
	        sitAnimationRotationPrev(Teethleft, sitProgress, (float)Math.toRadians(3.0D), 0, 0);
	        sitAnimationRotationPrev(tail3, sitProgress, (float)Math.toRadians(5.22D), (float)Math.toRadians(13.04D), (float)Math.toRadians(7.83D));
	        sitAnimationRotationPrev(leftHindLeg, sitProgress, (float)Math.toRadians(68.0D), 0, 0);
	        sitAnimationRotationPrev(upperJawBulb, sitProgress, (float)Math.toRadians(7.83D), 0, 0);
	        sitAnimationRotationPrev(OsteodermTail1, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
	        sitAnimationRotationPrev(leftFrontFoot, sitProgress, (float)Math.toRadians(40.0D), 0, 0);
	        sitAnimationRotationPrev(leftHindThigh, sitProgress, (float)Math.toRadians(26.0D), (float)Math.toRadians(15.65D), 0);
	        sitAnimationRotationPrev(Teethright, sitProgress, (float)Math.toRadians(3.0D), 0, 0);
	        sitAnimationRotationPrev(tail1, sitProgress, -((float)Math.toRadians(5.22D)), (float)Math.toRadians(10.43D), 0);
	        sitAnimationRotationPrev(rightFrontThigh, sitProgress, 0, 0, (float)Math.toRadians(18.26D));
	        sitAnimationRotationPrev(upperJaw, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
	        sitAnimationRotationPrev(OsteodermTail2, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
	        sitAnimationRotationPrev(leftFrontLeg, sitProgress, -((float)Math.toRadians(40.0D)), 0, 0);
	        sitAnimationRotationPrev(rightFrontLeg, sitProgress, -((float)Math.toRadians(40.43D)), 0, 0);
	        sitAnimationRotationPrev(LowerJaw, sitProgress, -((float)Math.toRadians(7.83D)), 0, 0);
	        sitAnimationRotationPrev(neck, sitProgress, (float)Math.toRadians(2.61D), (float)Math.toRadians(7.83D), 0);
	        sitAnimationRotationPrev(head, sitProgress, -((float)Math.toRadians(2.61D)), (float)Math.toRadians(15.65D), 0);
	        sitAnimationRotationPrev(rightHindLeg, sitProgress, (float)Math.toRadians(68.0D), 0, 0);
	        sitAnimationRotationPrev(leftFrontThigh, sitProgress, 0, (float)Math.toRadians(13.04D), 0);
	        sitAnimationRotationPrev(rightFrontFoot, sitProgress, (float)Math.toRadians(40.0D), (float)Math.toRadians(20.87D), 0);
	        sitAnimationRotationPrev(rightHindThigh, sitProgress, (float)Math.toRadians(26.09D), -((float)Math.toRadians(2.61D)), (float)Math.toRadians(18.26D));
	        sitAnimationRotationPrev(rightHindFoot, sitProgress, (float)Math.toRadians(38.0D), 0, 0);
	        sitAnimationPos(lowerBody, sitProgress, 0, 3, 0);
		}
		{
			float sitProgress = ((EntitySarcosuchus)entity).swimProgress;
			sitAnimationRotationPrev(OsteodermTail2, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
	        sitAnimationRotationPrev(tail1, sitProgress, -((float)Math.toRadians(5.22D)), 0, 0);
	        sitAnimationRotationPrev(Teethleft, sitProgress, (float)Math.toRadians(3.0D), 0, 0);
	        sitAnimationRotationPrev(rightFrontFoot, sitProgress, (float)Math.toRadians(90.0D), (float)Math.toRadians(90.0D), 0);
	        sitAnimationRotationPrev(upperJawBulb, sitProgress, (float)Math.toRadians(7.83D), 0, 0);
	        sitAnimationRotationPrev(rightFrontThigh, sitProgress, (float)Math.toRadians(90.0D), -((float)Math.toRadians(23.0D)), 0);
	        sitAnimationRotationPrev(leftFrontLeg, sitProgress, 0, 0, (float)Math.toRadians(20.0D));
	        sitAnimationRotationPrev(rightHindThigh, sitProgress, (float)Math.toRadians(90.0D), -((float)Math.toRadians(23.0D)), 0);
	        sitAnimationRotationPrev(OsteodermUpper, sitProgress, (float)Math.toRadians(5.22D), 0, 0);
	        sitAnimationRotationPrev(rightHindLeg, sitProgress, 0, 0, -((float)Math.toRadians(20.0D)));
	        sitAnimationRotationPrev(rightFrontLeg, sitProgress, -((float)Math.toRadians(10.43D)), 0, -((float)Math.toRadians(20.0D)));
	        sitAnimationRotationPrev(leftHindThigh, sitProgress, (float)Math.toRadians(90.0D), (float)Math.toRadians(23.0D), 0);
	        sitAnimationRotationPrev(LowerJaw, sitProgress, -((float)Math.toRadians(7.83D)), 0, 0);
	        sitAnimationRotationPrev(tail3, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
	        sitAnimationRotationPrev(head, sitProgress, -((float)Math.toRadians(5.22D)), 0, 0);
	        sitAnimationRotationPrev(upperJaw, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
	        sitAnimationRotationPrev(Teethright, sitProgress, (float)Math.toRadians(3.0D), 0, 0);
	        sitAnimationRotationPrev(leftFrontFoot, sitProgress, (float)Math.toRadians(90.0D), (float)Math.toRadians(90.0D), 0);
	        sitAnimationRotationPrev(OsteodermTail1, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
	        sitAnimationRotationPrev(leftHindFoot, sitProgress, (float)Math.toRadians(90.0D), (float)Math.toRadians(90.0D), 0);
	        sitAnimationRotationPrev(rightHindFoot, sitProgress, (float)Math.toRadians(90.0D), (float)Math.toRadians(90.0D), 0);
	        sitAnimationRotationPrev(neck, sitProgress, (float)Math.toRadians(5.22D), 0, 0);
	        sitAnimationRotationPrev(leftFrontThigh, sitProgress, (float)Math.toRadians(90.0D), (float)Math.toRadians(23.0D), 0);
	        sitAnimationRotationPrev(leftHindLeg, sitProgress, 0, 0, (float)Math.toRadians(20.0D));
	        sitAnimationPos(rightFrontThigh, sitProgress, 0, 3, 0);
	        sitAnimationPos(leftFrontThigh, sitProgress, 0, 3, 0);
	        sitAnimationPos(rightHindThigh, sitProgress, -1, 1, -2);
	        sitAnimationPos(leftHindThigh, sitProgress, -1, 1, -2);

		}
	}
}
